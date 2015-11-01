package org.tendiwa.pipes;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class Fluid3<I1, I2, I3> {
    private final I1 a;
    private final I2 b;
    private final I3 c;

    Fluid3(final I1 a, final I2 b, final I3 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    <O> O pipe(final TriFunction<I1, I2, I3, O> function) {
        return function.apply(this.a, this.b, this.c);
    }
}
