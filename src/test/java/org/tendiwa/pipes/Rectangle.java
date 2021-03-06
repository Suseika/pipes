package org.tendiwa.pipes;

import java.util.Objects;

/**
 * @author Georgy Vlasov (suseika@tendiwa.org)
 * @version $Id$
 * @since 0.1.0
 */
public final class Rectangle implements Fluid<Rectangle> {
    public final int x;
    public final int y;
    public final int width;
    public final int height;

    public Rectangle(int x, int y, int width, int height) {
        if (width < 1) {
            throw new IllegalArgumentException(
                "Wrong width "+width+"; must be >= 1"
            );
        }
        if (height < 1) {
            throw new IllegalArgumentException(
                "Wrong height "+height+"; must be >= 1"
            );
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(x, rectangle.x) &&
            Objects.equals(y, rectangle.y) &&
            Objects.equals(width, rectangle.width) &&
            Objects.equals(height, rectangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, width, height);
    }
}
