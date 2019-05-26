import java.util.Objects;

public class Pojo {

    public String field1;
    public int field2;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return field2 == pojo.field2 &&
                field1.equals(pojo.field1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2);
    }
}
