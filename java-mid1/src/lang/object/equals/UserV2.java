package lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserV2 userV2) {
            return id.equals(userV2.id);
        }

        return false;
    }


}
