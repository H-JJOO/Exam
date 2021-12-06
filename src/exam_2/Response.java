package exam_2;

import java.util.List;

public class Response {
    private List<Header> header;
    private List<Body> body;

    public List<Header> getHeader() {
        return header;
    }

    public void setHeader(List<Header> header) {
        this.header = header;
    }

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }
}
