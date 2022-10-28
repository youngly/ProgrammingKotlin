package ch3_functions;

import com.google.gson.Gson;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("jjjj");
//        CardContent<GridContent> gridContentCardContent = new CardContent<>();
//        gridContentCardContent.getContents().gridLogo = "";
//
//
        CardData<CardContent<GridContent>> cardContentCardData = new CardData<>();
        cardContentCardData.cardContent = new CardContent();
        cardContentCardData.cardContent.contents = new GridContent();
        cardContentCardData.dim = "2x2";
        cardContentCardData.cardContent.cpLogo = "cpLogo";
        cardContentCardData.cardContent.contents.gridLogo = "gridLogo";

        System.out.println(new Gson().toJson(cardContentCardData));
    }
}

class CardData<T extends CardContent> {
    String dim;

    T cardContent;
}

class CardContent<T extends BaseContent> {
    String cpName;
    String cpLogo;
    T contents;

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpLogo() {
        return cpLogo;
    }

    public void setCpLogo(String cpLogo) {
        this.cpLogo = cpLogo;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}

class BaseContent {
    String title;
    String logo;
}

class GridContent extends BaseContent {
    String gridLogo;
}

class ListContent extends BaseContent{
    String listLogo;
}
