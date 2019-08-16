package com.yixin.edu.model.course.ext;

import com.yixin.edu.model.course.Category;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/2/7.
 */
@Data
@ToString
public class CategoryParameter extends Category {

    List<String> bIds;
    List<String> cIds;

}
