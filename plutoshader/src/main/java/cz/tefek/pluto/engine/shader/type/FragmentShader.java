package cz.tefek.pluto.engine.shader.type;

import cz.tefek.pluto.engine.shader.ShaderCompiler;
import cz.tefek.pluto.io.asl.resource.ResourceAddress;

public final class FragmentShader implements IShader
{
    private int id;

    public FragmentShader(ResourceAddress address)
    {
        this.id = ShaderCompiler.load(address, EnumShaderType.FRAGMENT);
    }

    @Override
    public int getID()
    {
        return this.id;
    }
}
