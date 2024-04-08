package Java0328;

public class Reply {
    private int replyId;
    private String content;
    private String loginId;
    private int freeBoardId;

    public Reply() {
    }

    public Reply(int replyId, String content, String loginId, int freeBoardId) {
        this.replyId = replyId;
        this.content = content;
        this.loginId = loginId;
        this.freeBoardId = freeBoardId;
    }

    // getter
    public int getreplyId() {
        return replyId;
    }

    public String getContent() {
        return content;
    }

    public String getLoginId() {
        return loginId;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    // setter
    public void setreplyId(int replyId) {
        this.replyId = replyId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    @Override
    public String toString() {
        return replyId + ", " + content + ", " + loginId + ", " + freeBoardId;
    }
}
