package org.tendiwa.pipes;

import org.junit.Assert;
import org.junit.Test;
import static org.tendiwa.pipes.RectangleTransformations.translate;

/**
 * Unit tests for {@link Fluid2}.
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class Fluid2Test {
    @Test
    public void constructor() throws Exception {
        new Fluid2<>(
            new Rectangle(1,2,3,4),
            new Rectangle(2,3,4,5)
        );
    }

    @Test
    public void twoInputs() throws Exception {
        final Rectangle first = new Rectangle(1, 2, 3, 4);
        final Rectangle second = new Rectangle(1, 2, 3, 4);
        Assert.assertEquals(
            this.beautifulBounds(first, second),
            this.uglyBounds(first, second)
        );
    }

    private Rectangle uglyBounds(Rectangle first, Rectangle second) {
        return RectangleCombinations.bounds.apply(
            translate(10, 20).apply(first),
            second
        );
    }

    private Rectangle beautifulBounds(Rectangle first, Rectangle second) {
        return first
            .pipe(translate(10, 20))
            .with(second)
            .pipe(RectangleCombinations.bounds);
    }
}
