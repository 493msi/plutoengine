package cz.tefek.pluto.engine.graphics.gl.fbo;

import org.lwjgl.opengl.GL33;

import cz.tefek.pluto.engine.graphics.texture.MagFilter;
import cz.tefek.pluto.engine.graphics.texture.MinFilter;
import cz.tefek.pluto.engine.graphics.texture.WrapMode;

public class FramebufferDepthTexture extends FramebufferTexture
{
    public FramebufferDepthTexture(int width, int height, MagFilter magFilter, MinFilter minFilter, WrapMode wrapU, WrapMode wrapV)
    {
        super(width, height, magFilter, minFilter, wrapU, wrapV);
    }

    @Override
    public void writeData(long address)
    {
        GL33.glTexImage2D(this.type, 0, GL33.GL_DEPTH24_STENCIL8, this.width, this.height, 0, GL33.GL_DEPTH_STENCIL, GL33.GL_UNSIGNED_INT_24_8, address);
    }
}
