package org.tendiwa.pipes;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class RectangleCombinations {
    public static Rectangle bounds(Rectangle r1, Rectangle r2) {
        final int x = Math.min(r1.x, r2.x);
        final int y = Math.min(r1.y, r2.y);
        final int width = Math.max(r1.x, r2.x) - x + 1;
        final int height = Math.max(r1.y, r2.y) - y + 1;
        return new Rectangle(x, y, width, height);
    }
}
