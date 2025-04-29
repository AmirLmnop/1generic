package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price,  int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    // setter & getter
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public boolean isHardCover() {
        return isHardCover;
    }
    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return super.toString() + " PAgeCount: " + pageCount + ", isHardCover: " + isHardCover;
    }
    @Override
    protected String generateId() {
        return "2";
    }

}