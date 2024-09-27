package Day06;

public class _01_CssSelector {
    //BaseDriver ı hazırladık
    //Test metodlarına geçiş yaptık JUnit,Assert
    //GetCsss, getAttribute,navigate, tag locator
    //getCurrentUrl, getTitle
    //
    //Locator
    //
    //1- id
    //2- name
    //3- class
    //4- LinkText (a tag)
    //5- PartialLinkText (a tag)
    //6- CssSelector
    //7- XPath

    //7-CssSelector
    //
    //input[id='first8'][class='clfirst8']
    //
    //çocuk >  ilgili elemanın hemen 1 seviye
    //         altındaki elemanlar
    //
    //tum çocuklar (içindeki tüm elemanlar)
    //Space
    //
    //<div>
    //  <p>merhaba 1</p>
    //  <p>Merhaba 2</p>
    //
    //  <div>
    //    <img src="logo.png">
    //  </div>
    //</div>
    //
    //+  bitişik kardeşi bulur
    //~  tüm kardeşlerde ara
    //
    //^ : bunula başlayan
    //$ : bununla biten
    //: içinde geçen
    //
    //<ul id="liste">
    // <li>
    // <li>
    // <li>
    //</ul>
    //
    //[id='liste'] > :nth-child(3)
    //[id='liste'] > li


}
