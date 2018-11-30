package com.binarywang.test.test.test.user_info.generated;

import com.binarywang.test.test.test.user_info.UserInfo;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.binarywang.test.test.test.user_info.UserInfo} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUserInfoManager extends Manager<UserInfo> {
    
    TableIdentifier<UserInfo> IDENTIFIER = TableIdentifier.of("test", "test", "user_info");
    List<Field<UserInfo>> FIELDS = unmodifiableList(asList(
        UserInfo.ID,
        UserInfo.NAME,
        UserInfo.AGE
    ));
    
    @Override
    default Class<UserInfo> getEntityClass() {
        return UserInfo.class;
    }
}