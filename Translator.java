// Translator.java
public class Translator {
    public String translate(String text, String targetLanguage) {
        // Implement the translation logic here based on the target language
        // You can use a database or an external translation API to perform the translation
        
        // For demonstration purposes, we'll use a simple mapping of English to other languages
        switch (targetLanguage.toLowerCase()) {
            case "bahasa malaysia":
                return translateToBahasaMalaysia(text);
            case "arabic":
                return translateToArabic(text);
            case "korean":
                return translateToKorean(text);
            default:
                return "Translation not available for the target language.";
        }
    }
    
    private String translateToBahasaMalaysia(String text) {
        // Implement translation to Bahasa Malaysia
        // Replace this with your own translation logic or API call
        if (text.equalsIgnoreCase("good morning")) {
            return "Selamat pagi";
        } else if (text.equalsIgnoreCase("good night")) {
            return "Selamat malam";
        } else if (text.equalsIgnoreCase("how are you?")) {
            return "Apa khabar?";
        } else if (text.equalsIgnoreCase("thank you")) {
            return "Terima kasih";
        } else if (text.equalsIgnoreCase("goodbye")) {
            return "Selamat tinggal";
        } else if (text.equalsIgnoreCase("what's up?")) {
            return "Ada apa?";
        } else {
            return "Translation not available.";
        }
    }
    
    private String translateToArabic(String text) {
        // Implement translation to Arabic
        // Replace this with your own translation logic or API call
        if (text.equalsIgnoreCase("good morning")) {
            return "الخير صباح";
        } else if (text.equalsIgnoreCase("good night")) {
            return "مساؤك طاب";
        } else if (text.equalsIgnoreCase("how are you?")) {
            return "حالك؟";
        } else if (text.equalsIgnoreCase("thank you")) {
            return "لك شكرا";
        } else if (text.equalsIgnoreCase("goodbye")) {
            return "السالمة مع";
        } else if (text.equalsIgnoreCase("what's up?")) {
            return "أخبارك؟";
        } else {
            return "Translation not available.";
        }
    }
    
    private String translateToKorean(String text) {
        // Implement translation to Korean
        // Replace this with your own translation logic or API call
        if (text.equalsIgnoreCase("good morning")) {
            return "좋은 아침";
        } else if (text.equalsIgnoreCase("good night")) {
            return "안녕히 주무세요";
        } else if (text.equalsIgnoreCase("how are you?")) {
            return "어떻게 지내세요?";
        } else if (text.equalsIgnoreCase("thank you")) {
            return "감사합니다";
        } else if (text.equalsIgnoreCase("goodbye")) {
            return "안녕";
        } else if (text.equalsIgnoreCase("what's up?")) {
            return "뭐야?";
        } else {
            return "Translation not available.";
        }
    }
}
