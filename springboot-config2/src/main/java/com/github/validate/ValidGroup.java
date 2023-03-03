package com.github.validate;

import javax.validation.groups.Default;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 13:43
 */
public interface ValidGroup extends Default {

    interface Add extends ValidGroup {

    }

    interface Edit extends ValidGroup {

    }

    interface View extends ValidGroup {

    }

    interface Delete extends ValidGroup {

    }
}