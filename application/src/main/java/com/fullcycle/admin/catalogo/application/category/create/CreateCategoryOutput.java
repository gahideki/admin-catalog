package com.fullcycle.admin.catalogo.application.category.create;

import com.fullcycle.catalogo.domain.category.Category;
import com.fullcycle.catalogo.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {
    public static CreateCategoryOutput from(
            final Category aCategory
    ) {
        return new CreateCategoryOutput(aCategory.getId());
    }
}
