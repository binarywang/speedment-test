package com.binarywang.test.test.test.order_info;

import com.binarywang.test.test.test.order_info.generated.GeneratedOrderInfoEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named order_info.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author binarywang
 */
public final class OrderInfoEntityStoreSerializerImpl extends GeneratedOrderInfoEntityStoreSerializerImpl {
    
    public OrderInfoEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}