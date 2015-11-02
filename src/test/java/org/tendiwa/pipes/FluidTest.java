package org.tendiwa.pipes;


import org.junit.Assert;
import org.junit.Test;
import static org.tendiwa.pipes.RectangleProperties.minX;
import static org.tendiwa.pipes.RectangleTransformations.inflate;
import static org.tendiwa.pipes.RectangleTransformations.move;

/**
 * Unit tests for {@link Fluid}.
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class FluidTest {
    @Test
    public void pipes() {
        Assert.assertEquals(
            new Rectangle(0, 0, 10, 10)
                .pipe(r -> inflate(r, 2))
                .pipe(r -> move(r, -3, -3))
                .pipe(r -> minX(r)),
            new Integer(-5)
        );
    }

    @Test
    public void nonFluidToFluid() {
        Assert.assertEquals(
            Fluid.of("abc").pipe(String::length),
            new Integer(3)
        );
    }
}
