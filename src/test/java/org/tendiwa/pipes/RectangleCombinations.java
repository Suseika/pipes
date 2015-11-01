package org.tendiwa.pipes;

import java.util.function.BiFunction;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class RectangleCombinations {
    public static BiFunction<Rectangle, Rectangle, Rectangle> bounds =
        (r1, r2) -> {
            final int minX = Math.min(r1.x(), r2.x());
            final int minY = Math.min(r1.y(), r2.y());
            final int maxX = Math.max(r1.x(), r2.x());
            final int maxY = Math.max(r1.y(), r2.y());
            return new Rectangle(
                minX,
                minY,
                maxX - minX + 1,
                maxY - minY + 1
            );
        };
}
