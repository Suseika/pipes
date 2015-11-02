package org.tendiwa.pipes;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class RectangleProperties {
    public static int maxX(Rectangle r) {
        return r.x() + r.width() - 1;
    }

    public static int maxY(Rectangle r) {
        return r.y() + r.height() - 1;
    }

    public static int minX(Rectangle r) {
        return r.x();
    }

    public static int minY(Rectangle r) {
        return r.y();
    }
}
