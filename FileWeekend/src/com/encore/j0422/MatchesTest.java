package com.encore.j0422;

public class MatchesTest {

	// StringÅ¬·¡½º --> boolean str.matches(String regex);
	// regex ----> regular expression (Á¤±Ô Ç¥Çö½Ä, Á¤±Ô½Ä)
	// regex¸¦ ÅëÇØ Àü´ŞµÇ´Â ÆĞÅÏ¿¡ strÀÌ ºÎÇÕ(match)µÈ´Ù¸é true¸¦ ¸®ÅÏ.
	// ÃâÇö(¹ß»ı)È½¼ö¿¡ °ü·ÃµÈ ºÎÈ£: ?(0,1) , *(0~ ¹«ÇÑ´ë), +(1~¹«ÇÑ´ë)
	// ºÎÈ£¾øÀ½ <-- 1¹ø ÃâÇö
	public static void main(String[] args) {
		String str = "";
		str = "a";
		str = "aaaa";
		str = "aaaaaaaaaaa";

		// matches(ÆĞÅÏ¹®ÀÚ¿­)
		System.out.println("ºÎÈ£¾øÀ½: " + str.matches("[a]")); // a¹®ÀÚ: ÇÑ¹ø
		System.out.println("?ºÎÈ£: " + str.matches("[a]?")); // a¹®ÀÚ: 0,1 <-- »ı·«µµ true·Î º½
		System.out.println("*ºÎÈ£ : " + str.matches("[a]*")); // a¹®ÀÚ: 0 ~ ¹«ÇÑ´ë
		System.out.println("+ºÎÈ£ : " + str.matches("[a]+"));// a¹®ÀÚ: 1~¹«ÇÑ´ë
		System.out.println("======================");
		System.out.println(str.matches("[abc]")); // a¶Ç´Â b¶Ç´Â c¹®ÀÚÁß 1¹ø Ãâ¿¬ÇÑ´Ù¸é true
		System.out.println(str.matches("[abc+]")); // a,b,c¹®ÀÚ°¡ Á¶ÇÕµÇ¾î ¿©·¯¹ø ¹ß»ı

		String name = "gildongOO";
		// nameº¯¼ö¿¡ ´ëÇÑ ¿µ¹®ÀÚ Ã¼Å©!
		System.out.println("nameº¯¼öÀÇ ÀÌ¸§Ã¼Å©(¿µ¹®ÀÚ)Ã¼Å©: " + name.matches("[a-zA-z]+"));
		System.out.println("nameº¯¼öÀÇ ÀÌ¸§Ã¼Å©(¿µ¹®ÀÚ)Ã¼Å©: " + name.matches("[A-z]+"));

		// ¼ö º¯¼ö¿¡ ´ëÇÑ ¼ıÀÚ Ã¼Å©
		String su = "34567";
		System.out.println("suº¯¼öÀÇ ¼ıÀÚÃ¼Å©: " + su.matches("[0-9]+"));

		String hangul = "°¡³ª";
		// ÇÑ±Û º¯¼ö¿¡ ´ëÇÑ ÇÑ±Û Ã¼Å©!
		System.out.println("ÇÑ±ÛÃ¼Å©: " + hangul.matches("[¤¡-ÆR]+"));

		String id = "jinsil1106";
		// ¾ÆÀÌµğ´Â 8~12ÀÚ¸® ÀÔ´Ï´Ù. ¿µ¹®ÀÚ¿Í ¼ıÀÚ Á¶ÇÕÀÔ´Ï´Ù.
		String idPattern = "[A-z0-9]{8,12}"; // ¹®ÀÚ¿­ ±æÀÌ°¡ ÃÖ¼Ò 8~12
		// {8,12} 8ÀÌ»ó 12 ÀÌÇÏ{8, }: ÃÖ¼Ò 8ÀÌ»ó {8} : 8¹ø
		System.out.println("¾ÆÀÌµğÃ¼Å©: " + id.matches(idPattern));

		String juminBunho = "960309-3012345";
		String juminPattern =  "[\\d]{6}-[\\d]{7}"; // <-- \»ç¿ë½Ã \\¸¦ ½áÁÖ¸é ¿ª½½·¡½Ã·Î ºÁÁØ´Ù. ¾Æ´Ï¶ó¸é ¹®ÀÚ¿­·Î º½
		System.out.println("ÁÖ¹Î¹øÈ£ Ã¼Å©: " + juminBunho.matches(juminPattern));

		
	}
}
