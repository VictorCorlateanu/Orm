package student.examples.orm.entities;

public abstract class Entity {

    private int id;
    private String createdAt;

    public Entity() {
    }

    public Entity(int id) {
        this.id = id;
    }

    public Entity(int id, String createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Entity [id=" + id + ", createdAt=" + createdAt + "]";
    }

}
