package com.nujhat.texteditor;
interface TextComponent {
    String getText();
    String getDescription();
}

class Text implements TextComponent {
    private String text;

    public Text(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public String getDescription() {
        return text + ">";
    }
}

// Decorator abstract class
abstract class TextDecorator implements TextComponent {
    protected TextComponent textComponent;

    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return textComponent.getText();
    }

    @Override
    public String getDescription() {
        return textComponent.getDescription();
    }
}

// Concrete decorators
class BoldText extends TextDecorator {
    public BoldText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold";
    }
}

class ItalicText extends TextDecorator {
    public ItalicText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", italic";
    }
}

class BoldItalicText extends TextDecorator {
    public BoldItalicText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold and italic";
    }
}

class UnderLineText extends TextDecorator {
    public UnderLineText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", underline";
    }
}

// Main class 
public class TextEditor {
    public static void main(String[] args) {
        TextComponent myText = new Text("I am a DP");
        System.out.println(myText.getDescription());

        TextComponent boldText = new BoldText(myText);
        System.out.println(boldText.getDescription());

        TextComponent boldItalicText = new BoldItalicText(boldText);
        System.out.println(boldItalicText.getDescription());

        TextComponent underlinedText = new UnderLineText(boldItalicText);
        System.out.println(underlinedText.getDescription());
    }
}

