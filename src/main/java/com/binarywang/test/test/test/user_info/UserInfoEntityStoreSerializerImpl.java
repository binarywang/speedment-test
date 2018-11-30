package com.binarywang.test.test.test.user_info;

import com.binarywang.test.test.test.user_info.generated.GeneratedUserInfoEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named user_info.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author binarywang
 */
public final class UserInfoEntityStoreSerializerImpl extends GeneratedUserInfoEntityStoreSerializerImpl {
    
    public UserInfoEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}