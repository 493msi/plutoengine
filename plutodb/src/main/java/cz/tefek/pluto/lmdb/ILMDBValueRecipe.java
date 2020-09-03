package cz.tefek.pluto.lmdb;

import org.lwjgl.system.MemoryUtil;

import java.nio.ByteBuffer;

/**
 * @deprecated Usage discouraged until tested well enough.
 * */
@Deprecated
public interface ILMDBValueRecipe
{
    int sizeOf();

    void serialize(ByteBuffer output);

    void deserialize(ByteBuffer input);

    static int sizeOfUTF8(CharSequence string)
    {
        return Integer.BYTES + MemoryUtil.memLengthUTF8(string, false);
    }

    static void putUTF8(CharSequence string, ByteBuffer output)
    {
        int strLen = MemoryUtil.memUTF8(string, false, output, output.position() + Integer.BYTES);
        output.putInt(strLen);

        output.position(output.position() + strLen);
    }

    static String getUTF8(ByteBuffer input)
    {
        var strLen = input.getInt();
        var string = MemoryUtil.memUTF8(input, strLen);

        input.position(input.position() + strLen);

        return string;
    }
}
