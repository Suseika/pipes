package org.tendiwa.pipes;

import java.util.function.Function;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public interface Fluid<I> {
    default <O> O pipe(final Function<I, O> stage) {
        return stage.apply((I) this);
    }

    static <I> Fluid<I> of(final I input) {
        return new Fluid<I>() {
            @Override
            public <O> O pipe(final Function<I, O> stage) {
                return stage.apply(input);
            }
        };
    }
}
