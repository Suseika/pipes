package org.tendiwa.pipes;

import java.util.function.Function;
import static org.tendiwa.pipes.RectangleProperties.*;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class RectangleTransformations {
    public static Function<Rectangle, Rectangle> inflate(int d) {
        return (r) ->
            new Rectangle(
                r.x() - d,
                r.y() - d,
                maxX.apply(r) + d * 2,
                maxY.apply(r) + d * 2
            );
    }

    public static Function<Rectangle, Rectangle> deflate(int d) {
        return inflate(-d);
    }

    public static Function<Rectangle, Rectangle> translate(int dx, int dy) {
        return (r) ->
            new Rectangle(
                r.x() + dx,
                r.y() + dy,
                r.width(),
                r.height()
            );
    }
}
