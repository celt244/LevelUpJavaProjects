
public class Album {
String name;

    Page[] pages = new Page[20];

    public Album(String name) {
        this.name = name;
    }

    public void setPhotoTitle (String title, int photoNum, int pageNum){
        if( pageNum < pages.length && pageNum > -1 && pages[pageNum] != null){
            pages[pageNum].setPhotoTitle(title, photoNum);
        }
    }
}
