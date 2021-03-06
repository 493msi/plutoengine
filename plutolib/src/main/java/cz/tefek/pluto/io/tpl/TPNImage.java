package cz.tefek.pluto.io.tpl;

import java.nio.ByteBuffer;

/**
 * A wrapper around a native color buffer for easier handling
 * by various APIs, such as OpenGL and GLFW.
 *
 * @implNote TPNImage is <em>always</em> ABGR due to image format
 * limitations of {@link java.awt.image.BufferedImage}
 *
 * @author 493msi
 *
 * @since pre-alpha
 */
public class TPNImage
{
    private final ByteBuffer data;
    private final int width;
    private final int height;

    /**
     * Creates a new {@link TPNImage} from the specified buffer, width and height.
     *
     * @param bfr The input {@link ByteBuffer}
     * @param width This image's width
     * @param height This image's height
     *
     * @since pre-alpha
     * */
    public TPNImage(ByteBuffer bfr, int width, int height)
    {
        this.data = bfr;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of the color buffer.
     *
     * @return The width of this {@link TPNImage}
     *
     * @since pre-alpha
     * */
    public int getWidth()
    {
        return this.width;
    }

    /**
     * Returns the height of the color buffer.
     *
     * @return The height of this {@link TPNImage}
     *
     * @since pre-alpha
     * */
    public int getHeight()
    {
        return this.height;
    }

    /**
     * Returns a read-only view of the color buffer.
     *
     * @return This image's color {@link ByteBuffer}
     *
     * @since pre-alpha
     * */
    public ByteBuffer getData()
    {
        return this.data.asReadOnlyBuffer();
    }
}
