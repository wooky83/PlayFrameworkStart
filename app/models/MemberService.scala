package models

//import java.util.Date
//import javax.inject._
//
//import anorm.SqlParser._
//import anorm._
//import play.api.db.DBApi

//@Singleton
//class MemberService @Inject() (dbapi: DBApi){
//  private val db = dbapi.database("default")
//
//  val basicMember = {
//      get[Int]("member.mid") ~
//      get[String]("member.userId") ~
//      get[String]("member.password") ~
//      get[String]("member.nickname") ~
//      get[String]("member.email") ~
//      get[Option[Date]]("member.regdate") map {
//        case mid ~ userId ~ password ~ nickname ~ email ~ regdate =>
//          Member(mid, userId, password, nickname, email, regdate)
//      }
//  }
//
//  def getList = db.withConnection { implicit connection =>
//    SQL("SELECT * FROM member").as(basicMember *)
//
//  }
//
//  def insert(member: Member): Unit = {
//    db.withConnection { implicit connection =>
//      SQL(
//        """
//          insert into member (userId, password, nickname, email, regdate)
//          values ( {userId}, {password}, {nickname}, {email}, {regdate})
//        """
//      ).on(
//        'userId -> member.userId,
//        'password -> member.password,
//        'nickname -> member.nickname,
//        'email -> member.email,
//        'regdate -> member.regdate
//      ).executeUpdate()
//
//    }
//  }
//}

