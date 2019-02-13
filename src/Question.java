//********************************************************************
//  Question.java       Author: Lewis/Loftus/Cocking
//
//  Represents a question (and its answer).
//********************************************************************
public class Question implements Complexity, Comparable
{
   private String question, answer;
   private int complexityLevel;
   private boolean correct = false;
   //-----------------------------------------------------------------
   //  Sets up the question with a default complexity.
   //-----------------------------------------------------------------
   public Question (String query, String result)
   {
      question = query;
      answer = result;
      complexityLevel = 1;
   }
   //-----------------------------------------------------------------
   //  Sets the complexity level for this question.
   //-----------------------------------------------------------------
   public void setComplexity (int level)
   {
      complexityLevel = level;
   }
   //-----------------------------------------------------------------
   //  Returns the complexity level for this question.
   //-----------------------------------------------------------------
   public int getComplexity()
{
      return complexityLevel;
}
   //-----------------------------------------------------------------
   //  Returns the question.
   //-----------------------------------------------------------------
   public String getQuestion()
{
      return question;
}
   //-----------------------------------------------------------------
   //  Returns the answer to this question.
   //-----------------------------------------------------------------
   public String getAnswer()
   {
      return answer;
   }
   //-----------------------------------------------------------------
   //  Returns true if the candidate answer matches the answer.
   //-----------------------------------------------------------------
   public boolean answerCorrect (String candidateAnswer)
   {
      correct = answer.equals(candidateAnswer);
      return correct;
   }
   public boolean isCorrect() {
       return correct;
   }
   //-----------------------------------------------------------------
   //  Returns this question (and its answer) as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return question + "\n" + answer;
   }

    @Override
    public int compareTo(Object t) {
        return this.getComplexity() - ((Question)t).getComplexity();
    }
}
