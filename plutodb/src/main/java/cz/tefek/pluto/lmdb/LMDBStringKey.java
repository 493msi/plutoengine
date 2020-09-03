package cz.tefek.pluto.lmdb;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.lmdb.MDBVal;

/**
 * @deprecated Usage discouraged until tested well enough.
 * */
@Deprecated
public class LMDBStringKey extends LMDBKey
{
    private final String key;

    private LMDBStringKey(String key)
    {
        this.key = key;
    }

    public static LMDBStringKey from(String rawKey)
    {
        return new LMDBStringKey(rawKey);
    }

    @Override
    public MDBVal toMDBVal(MemoryStack stack)
    {
        var keyBuf = stack.ASCII(this.key, false);

        return MDBVal.mallocStack(stack).mv_size(keyBuf.capacity()).mv_data(keyBuf);
    }
}
