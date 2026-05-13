package com.example.atv_dbh2.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuario")

public class usuarioGamer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
        private String nickname;
        private String email;
        private int nivel;

}
