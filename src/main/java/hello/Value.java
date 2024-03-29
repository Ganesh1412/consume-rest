package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    public Long id;
    public String content;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

/*    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
*/
}
