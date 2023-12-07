//Lab2
interface Counter
{

    int countWords(String sentence);
    int countLetters(String sentence);
    int countSentence(String sentence);
}
class wordProcessor implements Counter
{
    @Override
    public int countWords(String sentence) {
        if(sentence.equals(null))
        {
            return 0;
        }
        else {
            String[] words = sentence.split(" ");
            int wordsCount = words.length;
            System.out.println("The number of words is:"+wordsCount);
            return wordsCount;

        }


    }

    @Override
    public int countLetters(String sentence) {
        int letterCount = sentence.length();
        System.out.println("Total numbers of letters:"+letterCount);
        return 0;
    }

    @Override
    public int countSentence(String sentence) {
        int sentenceCount = 0;
        String [] sentences = sentence.split("\\.");
        sentenceCount = sentences.length;
        System.out.println("The number of sentence is:"+sentenceCount);
        return sentenceCount;
    }


    public int number(int x, int y)
    {
        return x+y;
    }
}






 class Driver {

     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String getInput = input.nextLine();
//         int length = getInput.length();
//
//         System.out.println("He wrote:"+getInput);
//         System.out.println("The length is:"+length);
         Counter counter = new wordProcessor();
         counter.countLetters("Nices");
         counter.countWords("k xa yar");
         counter.countSentence("Thik xa.Yar.");
     }

}
