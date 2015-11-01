package org.tendiwa.pipes;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public interface TriFunction<I1, I2, I3, O> {
    O apply(I1 a, I2 b, I3 c);
}
