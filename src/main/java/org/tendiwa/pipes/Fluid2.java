package org.tendiwa.pipes;

import java.util.function.BiFunction;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class Fluid2<I1, I2> {
    private final I1 a;
    private final I2 b;

    Fluid2(final I1 a, final I2 b) {
        this.a = a;
        this.b = b;
    }

    public <O> O pipe(final BiFunction<I1, I2, O> function) {
        return function.apply(this.a, this.b);
    }

    public <I3> Fluid3<I1, I2, I3> with(final I3 another) {
        return new Fluid3<>(this.a, this.b, another);
    }
}
