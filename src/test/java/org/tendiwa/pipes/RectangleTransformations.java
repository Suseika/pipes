package org.tendiwa.pipes;

import static org.tendiwa.pipes.RectangleProperties.*;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class RectangleTransformations {
    public static Rectangle inflate(Rectangle r, int amount) {
        return new Rectangle(
            r.x() - amount,
            r.y() - amount,
            maxX(r) + amount * 2,
            maxY(r) + amount * 2
        );
    }
    public static Rectangle deflate(Rectangle r, int amount) {
        return inflate(r, -amount);
    }

    public static Rectangle move(Rectangle r, int dx, int dy) {
        return new Rectangle(
            r.x() + dx,
            r.y() + dy,
            r.width(),
            r.height()
        );
    }
}
