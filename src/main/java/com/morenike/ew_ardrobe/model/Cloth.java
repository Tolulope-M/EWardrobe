package com.morenike.ew_ardrobe.model;

import com.morenike.ew_ardrobe.model.enums.ClothCategory;
import com.morenike.ew_ardrobe.model.enums.ClothType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "cloths")
public class Cloth {
    @Id
    private Long id;
    private Long userId;
    private ClothCategory clothCategory;
    private ClothType clothType;
    private String description;
    @OneToOne(mappedBy = "cloth")
    @JoinColumn(name = "image_id", nullable = false)
    private Image image;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
