package org.societies.android.platform;

import org.societies.android.api.cis.SocialContract;

public final class SQLiteContract {
	//Basic DB file management:
	public static final String DB_NAME = "societies.db";
	public static final String DB_PATH = "/data/data/org.societies.android.platform/databases/";
	//TODO: This will be a preference and not a constant:
	public static final int DB_VERSION = 1;
	
	//Tables and table names
	public static final String ME_TABLE_NAME = "me";
	public static final String COMMUNITIES_TABLE_NAME = "communities";
	public static final String PEOPLE_TABLE_NAME = "people";
	public static final String SERVICES_TABLE_NAME = "services";
	public static final String RELATIONSHIP_TABLE_NAME = "relationships";
	public static final String MEMBERSHIP_TABLE_NAME = "memberships";
	public static final String SHARING_TABLE_NAME = "sharings";
	public static final String PEOPLE_ACTIVITIY_TABLE_NAME = "people_activities";
	public static final String COMMUNITIES_ACTIVITIY_TABLE_NAME = "communities_activities";
	public static final String SERVICES_ACTIVITIY_TABLE_NAME = "services_activities";
	

	//SQL commands for creating tables upon DB creation:
	public static final String ME_TABLE_CREATE = "create table if not exists " + ME_TABLE_NAME
			+ " (" + 
			SocialContract.Me._ID + " integer primary key autoincrement, " +
			SocialContract.Me.GLOBAL_ID + " text, " +
			SocialContract.Me.NAME + " text," +
			SocialContract.Me.DISPLAY_NAME + " text," +
			SocialContract.Me.USER_NAME + " text," +
			SocialContract.Me.PASSWORD + " text," +
			SocialContract.Me.ORIGIN + " text );";

	public static final String PEOPLE_TABLE_CREATE = "create table if not exists " + PEOPLE_TABLE_NAME
			+ " (" + 
			SocialContract.People._ID + " integer primary key autoincrement, " +
			SocialContract.People.GLOBAL_ID + " text, " +
			SocialContract.People.NAME + " text," +
			SocialContract.People.EMAIL + " text," +
			SocialContract.People.ORIGIN + " text," +
			SocialContract.People.DESCRIPTION + " text," +
			SocialContract.People.CREATION_DATE + " text," +
			SocialContract.People.LAST_MODIFIED_DATE + " text," +
			SocialContract.People.SYNC_STATUS + " text );";

	public static final String COMMUNITIES_TABLE_CREATE = "create table if not exists " + COMMUNITIES_TABLE_NAME
			+ " (" + 
			SocialContract.Communities._ID + " integer primary key autoincrement, " +
			SocialContract.Communities.GLOBAL_ID + " text, " +
			SocialContract.Communities.TYPE + " text," +
			SocialContract.Communities.NAME + " text," +
			SocialContract.Communities.OWNER_ID + " text," +
			SocialContract.Communities.ORIGIN + " text," +
			SocialContract.Communities.DESCRIPTION + " text," +
			SocialContract.Communities.CREATION_DATE + " text," +
			SocialContract.Communities.LAST_MODIFIED_DATE + " text," +
			SocialContract.Communities.SYNC_STATUS + " text );";

	public static final String SERVICES_TABLE_CREATE = "create table if not exists " + SERVICES_TABLE_NAME
			+ " (" + 
			SocialContract.Services._ID + " integer primary key autoincrement, " +
			SocialContract.Services.GLOBAL_ID + " text, " +
			SocialContract.Services.TYPE + " text," +
			SocialContract.Services.NAME + " text," +
			SocialContract.Services.OWNER_ID + " text," +
			SocialContract.Services.ORIGIN + " text," +
			SocialContract.Services.DESCRIPTION + " text," +
			SocialContract.Services.CREATION_DATE + " text," +
			SocialContract.Services.LAST_MODIFIED_DATE + " text," +
			SocialContract.Services.SYNC_STATUS + " text," +
			SocialContract.Services.AVAILABLE + " text," +
			SocialContract.Services.DEPENDENCY + " text," +
			SocialContract.Services.CONFIG + " text," +
			SocialContract.Services.URL + " text );";

	public static final String RELATIONSHIP_TABLE_CREATE = "create table if not exists " + RELATIONSHIP_TABLE_NAME
			+ " (" + 
			SocialContract.Relationship._ID + " integer primary key autoincrement, " +
			SocialContract.Relationship.GLOBAL_ID + " text, " +
			SocialContract.Relationship.GLOBAL_ID_P1 + " text," +
			SocialContract.Relationship.GLOBAL_ID_P2 + " text," +
			SocialContract.Relationship.TYPE + " text," +
			SocialContract.Relationship.ORIGIN + " text );";

	public static final String MEMBERSHIP_TABLE_CREATE = "create table if not exists " + MEMBERSHIP_TABLE_NAME
			+ " (" + 
			SocialContract.Membership._ID + " integer primary key autoincrement, " +
			SocialContract.Membership.GLOBAL_ID + " text, " +
			SocialContract.Membership.GLOBAL_ID_MEMBER + " text," +
			SocialContract.Membership.GLOBAL_ID_COMMUNITY + " text," +
			SocialContract.Membership.TYPE + " text not null," +
			SocialContract.Membership.ORIGIN + " text );";

	public static final String SHARING_TABLE_CREATE = "create table if not exists " + SHARING_TABLE_NAME
			+ " (" + 
			SocialContract.Sharing._ID + " integer primary key autoincrement, " +
			SocialContract.Sharing.GLOBAL_ID + " text, " +
			SocialContract.Sharing.OWNER_GLOBAL_ID + "text, " +
			SocialContract.Sharing.GLOBAL_ID_SERVICE + " text," +
			SocialContract.Sharing.GLOBAL_ID_COMMUNITY + " text," +
			SocialContract.Sharing.TYPE + " text," +
			SocialContract.Sharing.ORIGIN + " text );";

	public static final String PEOPLE_ACTIVITIY_TABLE_CREATE = "create table if not exists " + PEOPLE_ACTIVITIY_TABLE_NAME
			+ " (" + 
			SocialContract.PeopleActivity._ID + " integer primary key autoincrement, " +
			SocialContract.PeopleActivity.GLOBAL_ID + " text, " +
			SocialContract.PeopleActivity.GLOBAL_ID_FEED_OWNER + " text," +
			SocialContract.PeopleActivity.GLOBAL_ID_ACTOR + " text," +
			SocialContract.PeopleActivity.GLOBAL_ID_OBJECT + " text," +
			SocialContract.PeopleActivity.GLOBAL_ID_VERB + " text," +
			SocialContract.PeopleActivity.GLOBAL_ID_TARGET + " text," +
			SocialContract.PeopleActivity.ORIGIN + " text," +
			SocialContract.PeopleActivity.CREATION_DATE + " text," +
			SocialContract.PeopleActivity.SYNC_STATUS + " text);";

	public static final String COMMUNITIES_ACTIVITIY_TABLE_CREATE = "create table if not exists " + COMMUNITIES_ACTIVITIY_TABLE_NAME
			+ " (" + 
			SocialContract.CommunityActivity._ID + " integer primary key autoincrement, " +
			SocialContract.CommunityActivity.GLOBAL_ID + " text, " +
			SocialContract.CommunityActivity.GLOBAL_ID_FEED_OWNER + " text," +
			SocialContract.CommunityActivity.GLOBAL_ID_ACTOR + " text," +
			SocialContract.CommunityActivity.GLOBAL_ID_OBJECT + " text," +
			SocialContract.CommunityActivity.GLOBAL_ID_VERB + " text," +
			SocialContract.CommunityActivity.GLOBAL_ID_TARGET + " text," +
			SocialContract.CommunityActivity.ORIGIN + " text," +
			SocialContract.CommunityActivity.CREATION_DATE + " text," +
			SocialContract.CommunityActivity.SYNC_STATUS + " text );";

	public static final String SERVICES_ACTIVITIY_TABLE_CREATE = "create table if not exists " + SERVICES_ACTIVITIY_TABLE_NAME
			+ " (" + 
			SocialContract.ServiceActivity._ID + " integer primary key autoincrement, " +
			SocialContract.ServiceActivity.GLOBAL_ID + " text, " +
			SocialContract.ServiceActivity.GLOBAL_ID_FEED_OWNER + " text," +
			SocialContract.ServiceActivity.GLOBAL_ID_ACTOR + " text," +
			SocialContract.ServiceActivity.GLOBAL_ID_OBJECT + " text," +
			SocialContract.ServiceActivity.GLOBAL_ID_VERB + " text," +
			SocialContract.ServiceActivity.GLOBAL_ID_TARGET + " text," +
			SocialContract.ServiceActivity.ORIGIN + " text," +
			SocialContract.ServiceActivity.CREATION_DATE + " text," +
			SocialContract.ServiceActivity.SYNC_STATUS + " text );";
}