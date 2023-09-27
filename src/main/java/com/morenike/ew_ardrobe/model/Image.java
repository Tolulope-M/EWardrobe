package com.morenike.ew_ardrobe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "images")
public class Image {
    @Id
    private Long id;
    private Long userId;
    private File imageFile;
    private LocalDate dateAdded;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cloth_id", nullable = false)
    private Cloth cloth;
}
