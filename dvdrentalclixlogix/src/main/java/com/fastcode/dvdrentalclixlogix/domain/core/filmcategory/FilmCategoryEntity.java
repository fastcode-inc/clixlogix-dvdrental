package com.fastcode.dvdrentalclixlogix.domain.core.filmcategory;

import com.fastcode.dvdrentalclixlogix.domain.core.abstractentity.AbstractEntity;
import com.fastcode.dvdrentalclixlogix.domain.core.category.CategoryEntity;
import com.fastcode.dvdrentalclixlogix.domain.core.film.FilmEntity;
import java.time.*;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "film_category")
@IdClass(FilmCategoryId.class)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class FilmCategoryEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "category_id", nullable = false)
    private Short categoryId;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "film_id", nullable = false)
    private Short filmId;

    @Basic
    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private FilmEntity film;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;
}
