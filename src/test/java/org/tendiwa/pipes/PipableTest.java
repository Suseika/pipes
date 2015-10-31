package org.tendiwa.pipes;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Unit tests for {@link Fluid}.
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.
 */
public final class PipableTest {
    @Test
    public void pipes() {
        MatcherAssert.assertThat(
            new Rectangle(0, 0, 10, 10)
                .pipe(RectangleTransformations.inflate(2))
                .pipe(RectangleTransformations.translate(-3, -3))
                .pipe(RectangleProperties.minX),
            CoreMatchers.equalTo(-5)
        );
    }

    @Test
    public void nonFluidToFluid() {
        MatcherAssert.assertThat(
            Fluid.of("abc")
                .pipe(String::length),
            CoreMatchers.equalTo(3)
        );
    }
}
