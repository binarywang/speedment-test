package com.binarywang.test.test.test.order_info.generated;

import com.binarywang.test.test.test.order_info.OrderInfo;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;
import java.util.OptionalLong;

/**
 * The generated base for the {@link
 * com.binarywang.test.test.test.order_info.OrderInfo}-interface representing
 * entities of the {@code order_info}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedOrderInfo {
    
    /**
     * This Field corresponds to the {@link OrderInfo} field that can be
     * obtained using the {@link OrderInfo#getId()} method.
     */
    LongField<OrderInfo, Long> ID = DatastoreFields.createLongField(
        Identifier.ID,
        OrderInfo::getId,
        OrderInfo::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link OrderInfo} field that can be
     * obtained using the {@link OrderInfo#getUserId()} method.
     */
    ComparableField<OrderInfo, Long, Long> USER_ID = DatastoreFields.createComparableField(
        Identifier.USER_ID,
        o -> OptionalUtil.unwrap(o.getUserId()),
        OrderInfo::setUserId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link OrderInfo} field that can be
     * obtained using the {@link OrderInfo#getProductName()} method.
     */
    StringField<OrderInfo, String> PRODUCT_NAME = DatastoreFields.createStringField(
        Identifier.PRODUCT_NAME,
        OrderInfo::getProductName,
        OrderInfo::setProductName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link OrderInfo} field that can be
     * obtained using the {@link OrderInfo#getProductor()} method.
     */
    StringField<OrderInfo, String> PRODUCTOR = DatastoreFields.createStringField(
        Identifier.PRODUCTOR,
        o -> OptionalUtil.unwrap(o.getProductor()),
        OrderInfo::setProductor,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this OrderInfo. The id field corresponds to the
     * database column test.test.order_info.id.
     * 
     * @return the id of this OrderInfo
     */
    long getId();
    
    /**
     * Returns the userId of this OrderInfo. The userId field corresponds to the
     * database column test.test.order_info.user_id.
     * 
     * @return the userId of this OrderInfo
     */
    OptionalLong getUserId();
    
    /**
     * Returns the productName of this OrderInfo. The productName field
     * corresponds to the database column test.test.order_info.product_name.
     * 
     * @return the productName of this OrderInfo
     */
    String getProductName();
    
    /**
     * Returns the productor of this OrderInfo. The productor field corresponds
     * to the database column test.test.order_info.productor.
     * 
     * @return the productor of this OrderInfo
     */
    Optional<String> getProductor();
    
    /**
     * Sets the id of this OrderInfo. The id field corresponds to the database
     * column test.test.order_info.id.
     * 
     * @param id to set of this OrderInfo
     * @return   this OrderInfo instance
     */
    OrderInfo setId(long id);
    
    /**
     * Sets the userId of this OrderInfo. The userId field corresponds to the
     * database column test.test.order_info.user_id.
     * 
     * @param userId to set of this OrderInfo
     * @return       this OrderInfo instance
     */
    OrderInfo setUserId(Long userId);
    
    /**
     * Sets the productName of this OrderInfo. The productName field corresponds
     * to the database column test.test.order_info.product_name.
     * 
     * @param productName to set of this OrderInfo
     * @return            this OrderInfo instance
     */
    OrderInfo setProductName(String productName);
    
    /**
     * Sets the productor of this OrderInfo. The productor field corresponds to
     * the database column test.test.order_info.productor.
     * 
     * @param productor to set of this OrderInfo
     * @return          this OrderInfo instance
     */
    OrderInfo setProductor(String productor);
    
    enum Identifier implements ColumnIdentifier<OrderInfo> {
        
        ID           ("id"),
        USER_ID      ("user_id"),
        PRODUCT_NAME ("product_name"),
        PRODUCTOR    ("productor");
        
        private final String columnId;
        private final TableIdentifier<OrderInfo> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "test";
        }
        
        @Override
        public String getSchemaId() {
            return "test";
        }
        
        @Override
        public String getTableId() {
            return "order_info";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<OrderInfo> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}