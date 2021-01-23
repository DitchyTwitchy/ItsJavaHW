package itsJava.n_iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
public class User implements Serializable {
    private String username;
    private transient String password;
}
