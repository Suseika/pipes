package org.tendiwa.pipes;

import java.util.function.Function;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public interface Fluid<I> {
    default <O> O pipe(final Function<I, O> function) {
        return function.apply((I) this);
    }

    default <I2> Fluid2<I, I2> with(final I2 another) {
        return new Fluid2<>((I) this, another);
    }

    static <I> Fluid<I> of(final I input) {
        return new Fluid<I>() {
            @Override
            public <O> O pipe(final Function<I, O> function) {
                return function.apply(input);
            }
        };
    }
}
