/*
 GPL(GNU Public Library) is a Library Management System.
 Copyright (C) 2012-2013  Shaleen Jain

 This file is part of GPL.

 GPL is a free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Javapackage;

import java.awt.image.RenderedImage;
import java.beans.PropertyChangeEvent;
import myClasses.JarLocation;
import myClasses.MyQueries;
import java.io.File;
import java.util.prefs.Preferences;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Shaleen
 */
public class Setup extends javax.swing.JFrame {

    Preferences prefs = Preferences.userNodeForPackage(this.getClass());
    private static final String SETUP_HAS_RUN = "setupHasRun";
    private static final String DBMS_TYPE = "DbmsType";
    private static final String SERVER_URL = "serverURL";
    private static final String DB_NAME = "DatabaseName";
    static final Preferences prefs1 = Preferences.userRoot().node("/Javapackage");
    final static Logger logger = LoggerFactory.getLogger(Setup.class);

    /**
     * Creates new form Setup
     */
    public Setup() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jProgressBar1.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);

    }
    
    public class Task extends SwingWorker<Void, Void> {

    @Override
    protected Void doInBackground()  {
         for (int bc = 1001; bc <= 1051; bc++) 
         {
            //copy images
            File imageDir = new File(JarLocation.getLocation(new Setup()) + "\\images\\" + bc + ".jpg");
            if (!imageDir.canRead()) 
            {
                try
                {
                    RenderedImage img = ImageIO.read(new File("C:\\Users\\Shaleen\\Documents\\NetBeansProjects\\GPL\\src\\" + bc + ".jpg"));
                    ImageIO.write(img, "jpg", imageDir);
                } 
                catch (java.io.IOException e) 
                {
                    logger.error("Error Description:", e);
                }
            }

        }
         
         //Insert Records
        //<editor-fold defaultstate="collapsed" desc=" Book Records ">
        String queries = "Insert into books values (1001,\"Harry Potter and the Sorcerers Stone\",\"J. K. Rowling\",\"26 June 1997\",223,\"Fantasy\",\"Harry Potter and the Philosopher s Stone is the first novel in the Harry Potter series written by J. K. Rowling and featuring Harry Potter, a young wizard. It describes how Harry discovers he is a wizard, makes close friends and a few enemies at the Hogwarts School of Witchcraft and Wizardry, and with the help of his friends thwarts an attempted comeback by the evil wizard Lord Voldemort, who killed Harrys parents when Harry was one year old. \",\"null\");\n"
                + "Insert into books values (1002,\"Harry Potter and the Chamber of Secrets\",\"J. K. Rowling\",\"2 July 1998\",251,\"Fantasy\",\"Harry Potter and the Chamber of Secrets begins as Harry spends a miserable summer with his only remaining family, the Dursleys. During a dinner party hosted by his uncle and aunt, Harry is visited by Dobby, a house-elf. Dobby warns Harry not to return to Hogwarts, the magical school for wizards that Harry attended the previous year, explaining that terrible things will happen there. Harry politely disregards the warning, and Dobby wreaks havoc in the kitchen, infuriating the Dursleys.\",\"null\");\n"
                + "Insert into books values (1003,\"Harry Potter and the Prisoner of Azkaban\",\"J. K. Rowling\",\"8 July 1999\",317,\"Fantasy\",\"Harry Potter and the Prisoner of Azkaban is the third novel in the Harry Potter series written by J. K. Rowling. The book was published on 8 July 1999. The novel won the 1999 Whitbread Children s Book Award, the Bram Stoker Award, the 2000 Locus Award for Best Fantasy Novel, and was short-listed for other awards, including the Hugo. A film based on the novel was released on 31 May 2004, in the United Kingdom and 4 June 2004 in the U.S. and many other countries.\",\"null\");\n"
                + "Insert into books values (1004,\"Harry Potter and the Goblet of Fire\",\"J. K. Rowling\",\"8 July 2000\",635,\"Fantasy\",\"Harry Potter and the Goblet of Fire is the fourth novel in the Harry Potter series written by British author J. K. Rowling. Set during the protagonist Harry Potter s fourth year at Hogwarts School of Witchcraft and Wizardry, it follows the mystery surrounding the entry of Harry s name into the Triwizard Tournament, in which he is forced to compete.\",\"null\");\n"
                + "Insert into books values (1005,\"Kane and Abel\",\"Jeffrey Archer\",\"1979\",512,\"Adventure\",\"Kane and Abel is a 1979 novel by British author Jeffrey Archer. The title and story is a play on the Biblical brothers, Cain and Abel. Released in the United Kingdom in 1979 and in the United States in February 1980, the book was an international success. It reached No. 1 on the New York Times bestseller list and in 1985 was made into a CBS television miniseries titled Kane & Abel starring Peter Strauss as Rosnovski and Sam Neill as Kane.\",\"null\");\n"
                + "Insert into books values (1006,\"The Lost Symbol\",\"Dan Brown\",\"September 15, 2009\",639,\"Mystery-Thriller\",\"The Lost Symbol is a 2009 novel written by American writer Dan Brown.It is a thriller set in Washington, D.C., after the events of The Da Vinci Code, and relies on Freemasonry for both its recurring theme and its major characters.  Released on September 15, 2009, it is the third Brown novel to involve the character of Harvard University symbologist Robert Langdon, following 2000 s Angels & Demons and 2003 s The Da Vinci Code. It had a first printing of 6.5 million (5 million in North America, 1.5 million in the UK), the largest in Doubleday history. On its first day the book sold one million in hardcover and e-book versions in the U.S., the UK and Canada, making it the fastest selling adult novel in history. It was number one on the New York Times Best Seller list for hardcover fiction for the first six weeks of its release, and remained there until January 24 of the following year.\",\"null\");\n"
                + "Insert into books values (1007,\"The Da Vinci Code\",\"Dan Brown\",\"2003\",489,\"Mystery-Thriller\",\"The Da Vinci Code is a 2003 mystery-detective novel written by Dan Brown. It follows symbologist Robert Langdon and Sophie Neveu as they investigate a murder in Paris s Louvre Museum and discover a battle between the Priory of Sion and Opus Dei over the possibility of Jesus having been married to Mary Magdalene. The title of the novel refers to, among other things, the fact that the murder victim is found in the Grand Gallery of the Louvre, naked and posed like Leonardo da Vinci s famous drawing, the Vitruvian Man, with a cryptic message written beside his body and a pentacle drawn on his chest in his own blood.\",\"null\");\n"
                + "Insert into books values (1008,\"The Amulet of Samarkand\",\"Jonathan Stroud\",\"30 September 2003\",462,\"Fantasy\",\"The Amulet of Samarkand is the first book in the Bartimaeus Trilogy written by Jonathan Stroud. It is well known for its liberal use of footnotes to voice the title character s sarcastic comments, as well as story background.\",\"null\");\n"
                + "Insert into books values (1009,\"The Golems Eye\",\"Jonathan Stroud\",\"1 January 2004\",570,\"Fantasy\",\"The book begins two years after the events of The Amulet of Samarkand. Nathaniel is apprenticed to the Minister of Security, Jessica Whitwell; and is working as an understudy to the Minister of Internal Affairs, Julius Tallow. At the exceedingly young age of fourteen he is now a government official and a competent magician, but he no longer uses his original servant, Bartimaeus.\",\"null\");\n"
                + "Insert into books values (1010,\"Ptolemys Gate\",\"Jonathan Stroud\",\"September 2005\",515,\"Fantasy\",\"Three years have passed since the magician Nathaniel (otherwise known as John Mandrake) helped prevent an attack on London that would have been cataclysmic for its magicians and commoners. Now an established member of the British Government, he faces unprecedented problems: foreign wars are going badly, Britain’s enemies are mounting attacks close to London, and rebellion is fomenting among the commoners. Increasingly imperious and distracted, Nathaniel is treating Bartimaeus worse than ever.\",\"null\");\n"
                + "Insert into books values (1011,\"The Fountainhead\",\"Ayn Rand\",\"15 April 1943\",752,\"Philosophical\",\"The Fountainhead is a 1943 novel by Ayn Rand. It was Rand s first major literary success and brought her fame and financial success. More than 6.5 million copies of the book have been sold worldwide.\",\"null\");\n"
                + "Insert into books values (1012,\"The White Tiger\",\"Aravind Adiga\",\"April 22, 2008\",318,\"Philosophical\",\"The White Tiger is the debut novel by Indian author Aravind Adiga. It was first published in 2008 and won the 40th Man Booker Prize in the same year.[1] The novel provides a darkly humorous perspective of India’s class struggle in a globalized world as told through a retrospective narration from Balram Halwai, a village boy.\",\"null\");\n"
                + "Insert into books values (1013,\"Life Of Pi\",\"Yann Martel\",\"September 2001\",401,\"Philosophical\",\"Life of Pi is a fantasy adventure novel by Yann Martel published in 2001. The protagonist, Piscine Molitor Patel, an Indian boy from Pondicherry, explores issues of spirituality and practicality from an early age.\",\"null\");\n"
                + "Insert into books values (1014,\"Midnights Children\",\"Salman Rushdie\",\"April 1981\",446,\"Historical Fiction\",\"Midnight s Children is a 1980 book by Salman Rushdie that deals with India s transition from British colonialism to independence and the partition of India. It is considered an example of postcolonial literature and magical realism. The story is told by its chief protagonist, Saleem Sinai, and is set in the context of actual historical events as with historical fiction.\",\"null\");\n"
                + "Insert into books values (1015,\"The Witches\",\"Roald Dahl\",\"1983\",208,\"Children\",\"The book s witches, described as demons in human form are revealed in the opening chapters to be a constant threat to global security. While they look human, and look and act like normal human women, they are secretly plotting to kill every single child on Earth. No other reason for this is given, other than the foul stench children produce for witches.\",\"null\");\n"
                + "Insert into books values (1016,\"Charlie and the Chocolate Factory\",\"Roald Dahl\",\"1964\",155,\"Children\",\"Charlie and the Chocolate Factory is a 1964 children s book by British author Roald Dahl. The story features the adventures of young Charlie Bucket inside the chocolate factory of eccentric chocolatier Willy Wonka.\",\"null\");\n"
                + "Insert into books values (1017,\"Matilda\",\"Roald Dahl\",\"1988\",250,\"Children\",\"Matilda is a children s novel by British author Roald Dahl. It was published in 1988 by Jonathan Cape in London, with illustrations by Quentin Blake. The story is about Matilda Wormwood, an extraordinary child with ordinary and rather unpleasant parents, who are contemptuous of their daughter s prodigious talents, and her discovery of her telekinetic abilities. It was adapted into a film in 1996, a two-part adaptation for BBC Radio 4 (later re-broadcast on BBC Radio 4 Extra) starring Nicola McAuliffe as Matilda and narrated by Lenny Henry. In 2010 it was adapted into a musical.\",\"null\");\n"
                + "Insert into books values (1018,\"Relativity: The Special and the General Theory\",\"Albert Einstein\",\"1920\",288,\"Science\",\"The theory of relativity, or simply relativity, generally encompasses two theories of Albert Einstein: special relativity and general relativity.\",\"null\");\n"
                + "Insert into books values (1019,\"Gitanjali\",\"Rabindranath Tagore\",\"1912\",128,\"Poem\",\"Gitanjali is a collection of poems by the Bengali poet Rabindranath Tagore. The original Bengali collection of 157 poems was published on August 14, 1910. The English Gitanjali or Song Offerings is a collection of 103 English poems of Tagore s own English translations of his Bengali poems first published in November 1912 by the India Society of London.\",\"null\");\n"
                + "Insert into books values (1020,\"Love Story\",\"Erich Segal\",\"February 14, 1970\",131,\"Drama\",\"Love Story is a 1970 romance novel by American writer Erich Segal. The book s origins were in that of a screenplay Segal wrote and was subsequently approved for production by Paramount Pictures. Paramount requested that Segal adapt the story into novel form as a preview of sorts for the film. \",\"null\");\n"
                + "Insert into books values (1021,\"Doctors\",\"Erich Segal\",\"1988\",679,\"Drama\",\"Doctors (1988) by Erich Segal deals with the Harvard Medical School class of 1962, with emphasis on the two main characters, Barney Livingston and Laura Castellano. They grew up next to each other and always aspired to be doctors, eventually ending up in medical school together.\",\"null\");\n"
                + "Insert into books values (1022,\"Sea of Poppies\",\"Amitav Ghosh\",\"14 October 2008\",528,\"Novel\",\"Sea of Poppies (2008) is a novel by Indian novelist Amitav Ghosh which was shortlisted for the Man Booker Prize in 2008[1]. It is the first volume of what will be the Ibis trilogy. The main characters include Deeti, an ordinary village woman, a mulatto American sailor named Zachary Reid, an Indian rajah / zamindar called Neel Rattan Halder, and Benjamin Burnham, an evangelist opium trader.\",\"null\");\n"
                + "Insert into books values (1023,\"River Of Smoke\",\"Amitav Ghosh\",\"18 June 2011\",557,\"Novel\",\"River of Smoke (2011) is a novel by Indian novelist Amitav Ghosh. It is the second volume of what will be the Ibis trilogy.\",\"null\");\n"
                + "Insert into books values (1024,\"The Audacity of Hope\",\"Barack Obama\",\"October 17, 2006\",362,\"Inspirational\",\"The Audacity of Hope: Thoughts on Reclaiming the American Dream is the second book written by then-Senator Barack Obama.[1] In the fall of 2006 it became number one on both the New York Times and Amazon.com bestsellers lists after Obama was endorsed by Oprah Winfrey.\",\"null\");\n"
                + "Insert into books values (1025,\"The Kashmiri Storyteller\",\"Ruskin Bond\",\"15 Nov 2011\",103,\"Novel\",\"Ruskin Bond’s new illustrated book The Kashmiri Storyteller consists of old unpublished stories that had been lying in his steel trunk for 40 years. The setting is Mussoorie in the Garhwal hills and the season is winter.\",\"null\");\n"
                + "Insert into books values (1026,\"The Best of Ruskin Bond: Delhi Is Not Far\",\"Ruskin Bond\",\"26 October 2005\",428,\"Novel\",\"Delhi is not far brings the best of Ruskin Bond s prose and poetry. For over four decades,by way of innumerable novels,essays,short stories,and poems,the author has mapped out and peoples a unique literary landscape.This anthology has selections from all the major books and also features an unpublished novella Delhi is not Far.\",\"null\");\n"
                + "Insert into books values (1027,\"Steve Jobs: The Exclusive Biography\",\"Walter Isaacson\",\"October 24, 2011\",656,\"Biography\",\"Steve Jobs is the authorized biography of Steve Jobs. The biography was written at the request of Jobs by Walter Isaacson, a former executive at CNN and Time who has written best-selling biographies of Benjamin Franklin and Albert Einstein.\",\"null\");\n"
                + "Insert into books values (1028,\"Management Tips\",\"Harvard Business Review\",\"Oct 04, 2011\",224,\"Reference\",\"As a manager, you re shouldering more and more responsibilities-from maximizing your team s performance to increasing your company s market share to building profitable customer relationships. On top of all that, you need to orchestrate your own time and keep your career on track.\",\"null\");\n"
                + "Insert into books values (1029,\"Aleph\",\"Paulo Coelho\",\"August 9, 2011\",320,\"Spiritual\",\"Aleph is regarded as Paulo Coelho’s most personal book to date. The book is autobiographical and tells the story of the author’s journey of self discovery.\",\"null\");\n"
                + "Insert into books values (1030,\"Only Time Will Tell\",\"Jeffrey Archer\",\"2011\",400,\"Novel\",\"Only Time Will Tell is a first part of the five in Clifton Chronicles by Jeffrey Archer. The book was published worldwide in 2011. It was launched by Jeffrey Archer himself at Bangalore, India in March 2011, as the beginning of a global book tour.\",\"null\");\n"
                + "Insert into books values (1031,\"Catch-22\",\"Joseph Heller\",\"11 November 1961\",453,\"Novel\",\"Catch-22 is a satirical and historical novel by the American author Joseph Heller. He began writing it in 1953, and the novel was first published in 1961. It is set during World War II in 1943 and is frequently cited as one of the great literary works of the twentieth century.\",\"null\");\n"
                + "Insert into books values (1032,\"The Notebooks\",\"Nicholas Sparks\",\"October 1, 1996\",224,\"Romance\",\"The Notebook is a 1996 romantic novel by American novelist Nicholas Sparks, based on a true story. The novel was later adapted into a popular romance film of the same name, The Notebook, in 2004.\",\"null\");\n"
                + "Insert into books values (1033,\"A Thousand Splendid Suns\",\"Khaled Hosseini\",\"May 22, 2007\",384,\"Novel\",\"A Thousand Splendid Suns is a 2007 novel by Afghan-American author Khaled Hosseini. It is his second, following his bestselling 2003 debut, The Kite Runner. The book focuses on the tumultuous lives of two Afghan women and how their lives cross each other, spanning from the 1960s to 2003.\",\"null\");\n"
                + "Insert into books values (1034,\"The Catcher in the Rye\",\"J. D. Salinger\",\"July 16, 1951\",214 ,\"Novel\",\"The Catcher in the Rye is a 1951 novel by J. D. Salinger.Originally published for adults, it has since become popular with adolescent readers for its themes of teenage confusion, angst, alienation,and rebellion. It has been translated into almost all of the world s major languages.\",\"null\");\n"
                + "Insert into books values (1035,\"PS, I Love You\",\"Cecelia Ahern\",\"April 2004\",655,\"Romance\",\"P.S. I Love You is Irish writer Cecelia Ahern s first novel, published in 2004. The book reached #1 bestseller status in Ireland (for 19 weeks), the United Kingdom, the United States, Germany, and the Netherlands.\",\"null\");\n"
                + "Insert into books values (1036,\"The Godfather\",\"Mario Puzo\",\"10 March 1969\",595,\"Thriller\",\"The Godfather is a crime novel written by Italian American author Mario Puzo, originally published in 1969 by G. P. Putnam s Sons. It details the story of a fictitious Sicilian Mafia New York City (and Long Beach, New York) and headed by Don Vito Corleone, who became synonymous with the Italian Mafia.\",\"null\");\n"
                + "Insert into books values (1037,\"If Tomorrow Comes\",\"Sidney Sheldon\",\"Nov 2, 1988\",416,\"Thriller\",\"If Tomorrow Comes is a 1985 crime fiction novel by American author Sidney Sheldon. It is a story pertaining an ordinary woman who is framed by a mafia, her quest for vengeance towards them and later life as a con artist.\",\"null\");\n"
                + "Insert into books values (1038,\"Oliver Twist\",\"Charles Dickens\",\"February 1837\",478,\"Children\",\"Oliver Twist, also known as The Parish Boy s Progress, is the second novel by English author Charles Dickens, published by Richard Bentley in 1838. The story is about an orphan, Oliver Twist, who endures a miserable existence in a workhouse and then is placed with an undertaker.\",\"null\");\n"
                + "Insert into books values (1039,\"Brida\",\"Paulo Coelho\",\"1990\",266,\"Spiritual\",\"Brida is a novel by Brazilian author Paulo Coelho. It is the story of a beautiful young Irish girl and her quest for knowledge. On her journey she meets a wise man who teaches her to overcome fear and a woman who teaches her how to dance to the hidden music of the world. They see in her a gift, but must let her make her own voyage of discovery.\",\"null\");\n"
                + "Insert into books values (1040,\"The Zahir\",\"Paulo Coelho\",\"2005\",336,\"Spiritual\",\"The Zahir is a 2005 novel by the Brazilian writer Paulo Coelho. Just as in an earlier book, The Alchemist, The Zahir is about a pilgrimage. The book touches on themes of love, loss and obsession.\",\"null\");\n"
                + "Insert into books values (1041,\"The Alchemist\",\"Paulo Coelho\",\"1993\",163,\"Spiritual\",\"The Alchemist is a novel by Paulo Coelho first published in 1988. Originally written in Portuguese, it has been translated into 71 languages as of 2011. An allegorical novel, The Alchemist follows a young Andalusian shepherd named Santiago in his journey to Egypt, after having a recurring dream of finding treasure there.\",\"null\");\n"
                + "Insert into books values (1042,\"Little Women\",\"Louisa May Alcott\",\"1868 & 1869\",464,\"Novel\",\"Little Women is a novel by American author Louisa May Alcott (1832–1888). The book was written and set in the Alcott family home, Orchard House, in Concord, Massachusetts. It was published in two volumes in 1868 and 1869. The novel follows the lives of four sisters – Meg, Jo, Beth, and Amy March – and is loosely based on the author s childhood experiences with her three sisters.\",\"null\");\n"
                + "Insert into books values (1043,\"Great Expectations\",\"Charles Dickens\",\"1861\",542,\"Children\",\"Great Expectations is a novel by Charles Dickens. It depicts the growth and personal development of an orphan named Pip. The novel was first published in serial literature serial form in Dickens  weekly periodical All the Year Round, from 1 December 1860 to August 1861.\",\"null\");\n"
                + "Insert into books values (1044,\"Wings of Fire\",\"A. P. J. Abdul Kalam\",\"1999\",180,\"Autobiography\",\"P J Abdul Kalam,former President of India. It was written by Dr. Kalam and Arun Tiwari.Kalam examines his early life, effort, hardship, fortitude, luck and chance that eventually led him to lead Indian space research, nuclear and missile programs.\",\"null\");\n"
                + "Insert into books values (1045,\"The Finkler Question\",\"Howard Jacobson\",\"2010\",320,\"Novel\",\"The Finkler Question is a 2010 novel written by British author Howard Jacobson. The novel won the Man Booker Prize in 2010 and was the first comic novel to win the prize since Kingsley Amis s The Old Devils in 1986.\",\"null\");\n"
                + "Insert into books values (1046,\"Romeo And Juliet\",\"William Shakespeare\",\"1597\",174,\"Romance\",\"Romeo and Juliet is a tragedy written early in the career of William Shakespeare about two young star-crossed lovers whose deaths ultimately unite their feuding families. It was among Shakespeare s most popular plays during his lifetime and, along with Hamlet, is one of his most frequently performed plays. Today, the title characters are regarded as archetypal young lovers.\",\"null\");\n"
                + "Insert into books values (1047,\"The Man Who Knew Infinity\",\"Robert Kanigel\",\"1991\",438,\"Biography\",\"The Man Who Knew Infinity: A Life of the Genius Ramanujan is the biography of the Indian mathematician Srinivasa Ramanujan written in 1991 by Robert Kanigel. The book gives a detailed account of his upbringing in India, his mathematical achievements and his mathematical collaboration with English mathematician G. H. Hardy. The book also reviews the life of Hardy and the academic culture of Cambridge University during early twentieth century.\",\"null\");\n"
                + "Insert into books values (1048,\"Its Not About the Bike: My Journey Back to Life\",\"Lance Armstrong\",\"May 22, 2000\",288,\"Autobiography\",\"The book was written shortly after Armstrong had won the 1999 Tour de France: he went on to win it six further times in successive years, establishing a record. In 1996, he had been diagnosed with testicular cancer, which spread to his lungs, abdomen and brain, and was only given a 40 percent chance of living.\",\"null\");\n"
                + "Insert into books values (1049,\"The Hunger Games\",\"Suzanne Collins\",\"September 14, 2008\",374,\"Fiction\",\"The Hunger Games is a 2008 young adult novel by American writer Suzanne Collins. It is written in the voice of 16-year-old Katniss Everdeen, who lives in the post-apocalyptic nation of Panem, where the countries of North America once existed. The Capitol, a highly advanced metropolis, exercises political control over the rest of the nation.\",\"null\");\n"
                + "Insert into books values (1050,\"The Discovery Of India\",\"Jawaharlal Nehru\",\"1946\",584,\"Historical\",\"The Discovery of India was written by India s first Prime Minister Jawaharlal Nehru during his imprisonment in 1942-1946 at Ahmednagar in the Ahmednagar Fort.\",\"null\");\n"
                + "Insert into books values (1051,\"The Curious Incident of the Dog in the Night-Time\",\"Mark Haddon\",\"May 2003\",226,\"Mystery novel\",\"The Curious Incident of the Dog in the Night-Time is a 2003 mystery novel by British writer Mark Haddon. Its title quotes the fictional detective Sherlock Holmes in Arthur Conan Doyle s 1892 short story  Silver Blaze . Haddon and The Curious Incident won the Whitbread Book Awards for Best Novel and Book of the Year,[1] the Commonwealth Writers  Prize for Best First Book.[2] and the Guardian Children s Fiction Prize.[3]\",\"null\");";
        //</editor-fold>
        MyQueries.excUpdate(queries);
        
       return null;
    }
    
   @Override
       protected void done() {
           try 
           {
            l5.setText("Done");
            jProgressBar1.setValue(100);
           } 
           catch (Exception ignore)
           {
           }
       }
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel0 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                propChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel0.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        l2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l2.setText("<html>\n<body>\nPlease wait<br>Initializing...\n</body>\n</html>");
        jPanel0.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel0.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l1.setText("Please Select the kind of database you require:");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setText("Local SQLite Database");
        rb2.setOpaque(false);
        jPanel1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, -1));

        buttonGroup1.add(rb1);
        rb1.setText("Online MySQL Database");
        rb1.setOpaque(false);
        jPanel1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l3.setText("<HTML>\n<body>\nPlease enter the MySQL Database Details:<br> Please make sure the database exits and has the required tables.\n</body>\n</HTML>");
        l3.setToolTipText("\n");
        jPanel2.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jButton3.setText("Start");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel6.setText("Server URL:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setText("Port no:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel8.setText("Username:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel9.setText("Password:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        t1.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:localhost,www.sql.com</p>\n</body>\n</html>\n");
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, -1));

        t2.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:3306,80</p>\n</body>\n</html>");
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 90, -1));

        t3.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:root</p>\n</body>\n</html>");
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, -1));

        t4.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:123</p>\n</body>\n</html>");
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, -1));

        jLabel10.setText("Database name:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        t5.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:test</p>\n</body>\n</html>");
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 90, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        l4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l4.setText("Please Enter the SQLite Database Details:");
        jPanel3.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, 20));

        jLabel11.setText("Database Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        jPanel3.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 90, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("Finish");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l5.setText("Do you wish to populate your database with some records?");
        jPanel4.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 360, 20));

        buttonGroup1.add(rb3);
        rb3.setText("Yes");
        rb3.setOpaque(false);
        jPanel4.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        buttonGroup1.add(rb4);
        rb4.setText("No");
        rb4.setOpaque(false);
        jPanel4.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, -1));
        jPanel4.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 410, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        setSize(new java.awt.Dimension(699, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        boolean oldValue = prefs.getBoolean(SETUP_HAS_RUN, false);
        if (oldValue)
        {
            StartPage a = new StartPage();
            a.setVisible(true);
            this.dispose();
            prefs.putBoolean(SETUP_HAS_RUN, false);

        }
        else 
        {
            l2.setText("<html>\n" + "<body>\n" + "Welcome!<br>This Wizard will help you setup this program.<br>Click next to continue..\n" + "</body>\n" + "</html>");
            jButton1.setVisible(true);
        }


    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel0.setVisible(false);
        jPanel1.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (rb1.isSelected()) 
        {
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
            jButton3.setVisible(true);
            prefs.put(DBMS_TYPE, "mysql");
        } 
        else if (rb2.isSelected()) 
        {
            jPanel1.setVisible(false);
            jPanel3.setVisible(true);
            jButton4.setVisible(true);
            prefs.put(DBMS_TYPE, "sqlite");
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select one of the options");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (t1.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the server url");
        } 
        else if (t2.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the port no");
        } 
        else if (t3.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the username");
        } 
        else if (t4.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the password");
        } 
        else if (t4.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the database name");
        } 
        else 
        {
            String url = "jdbc:mysql://" + t1.getText() + ":" + t2.getText() +"/"+ t5.getText();
            String user = t3.getText();
            String password = t4.getText();
            prefs.put(SERVER_URL, url + "," + user + "," + password);
            jPanel2.setVisible(false);
            jPanel4.setVisible(true);
            jButton5.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (t6.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the database name");
        } 
        else 
        {
            String dbname = t6.getText();
            prefs.put(DB_NAME, dbname);
            jPanel3.setVisible(false);
            jPanel4.setVisible(true);
            jButton5.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void propChange(java.beans.PropertyChangeListener evt1) {                            
       Task task = new Task();
        if (!task.isDone()) {
            int progress = task.getProgress();
            jProgressBar1.setValue(progress);

        }
    } 
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (rb3.isSelected() || rb4.isSelected()) 
        {
            try 
            {
                prefs.flush();
            } 
            catch (Exception e)
            {
            }
            File dir1 = new File(JarLocation.getLocation(this) + "\\databases\\");
            if (!dir1.canRead()) 
            {
                dir1.mkdirs();
            }
            
            // Create the required tables
            String q1 = "create table settings(fine integer,issuetime integer,maxbooks integer);\n"
                    + "create table users (issuerId integer(5) ,fname varchar(15), lname varchar(15),username varchar(20) Primary key,password varchar(32),gender varchar(10),address varchar(40), phoneno long , type varchar(10));\n"
                    + "create table books( bookcode integer Primary Key,bookname varchar(50),author varchar(40),Releasedate varchar(25),Pages integer,genre varchar(30),review varchar(1000),imgurl varchar(150));\n";
            MyQueries.excUpdate(q1);
            String query1 = "create table accounts(IssuerId integer,username Varchar(10),BookCode integer Primary Key,Bookname Varchar(50),IssueDate date,ReturnDate date);";
            String query2 = "insert into settings values(1,7,3);";
            String query3 = "Insert into users values (100,\"admin\",\"admin\",\"admin\",\"c75af13c992650118785608ba2506a3\",\"Male\",\"7/87,Dallas Street,Houston\",9764578654,\"admin\");";
            MyQueries.excUpdate(query1);
            MyQueries.excUpdate(query2);
            MyQueries.excUpdate(query3);
            
            if (rb3.isSelected()) 
            {
                jProgressBar1.setVisible(true);
                rb3.setVisible(false);
                rb4.setVisible(false);
                
                File dir = new File(JarLocation.getLocation(this) + "\\images\\");
                if (!dir.canRead())
                {
                    dir.mkdirs();
                }
                              
                //Call the SwingWorker
                Task task = new Task();   
                task.execute(); 
                task.addPropertyChangeListener(evt1);
                l5.setText("Copying images and Inserting Records...");
                
            }
            
            //prefs.putBoolean(SETUP_HAS_RUN, true);
            JOptionPane.showMessageDialog(this, "Setup Completed Succsesfully");
            try
            {
                prefs.flush();
            }
            catch (Exception e)
            {
            }
            StartPage a = new StartPage();
            a.setVisible(true);
            JOptionPane.showMessageDialog(a, "An imperative admin account has been created for you.\n Please use the following info to login\n Username: admin\n Password: password");
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one of the options");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void propChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_propChange
       Task task = new Task();
        if (!task.isDone()) {
            int progress = task.getProgress();
            jProgressBar1.setValue(progress);

        }
    }//GEN-LAST:event_propChange

//    public void propertyChange(PropertyChangeEvent evt) {
//        Task task = new Task();
//        if (!task.isDone()) {
//            int progress = task.getProgress();
//            jProgressBar1.setValue(progress);
//
//        }
//   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setup().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
