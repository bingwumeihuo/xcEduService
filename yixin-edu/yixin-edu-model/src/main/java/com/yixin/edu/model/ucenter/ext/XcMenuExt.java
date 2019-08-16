package com.yixin.edu.model.ucenter.ext;

import com.yixin.edu.model.course.ext.CategoryNode;
import com.yixin.edu.model.ucenter.XcMenu;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcMenuExt extends XcMenu {

    List<CategoryNode> children;
}
