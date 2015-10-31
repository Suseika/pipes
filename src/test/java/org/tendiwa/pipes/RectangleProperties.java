package org.tendiwa.pipes;

import java.util.function.Function;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.
 */
public final class RectangleProperties {
    public static Function<Rectangle, Integer> maxX =
        (r) -> r.x() + r.width() - 1;

    public static Function<Rectangle, Integer> maxY =
        (r) -> r.y() + r.height() - 1;

    public static Function<Rectangle, Integer> minX =
        Rectangle::x;

    public static Function<Rectangle, Integer> minY =
        Rectangle::y;
}
