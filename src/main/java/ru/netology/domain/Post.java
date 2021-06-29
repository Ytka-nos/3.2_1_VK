package ru.netology.domain;


public class Post {
    private int id;
    private String authorName;
     private int authorAvatarUrl;
     private String DateOfPost;
     private String TextOfPost;
     private String ImageUrl;
     private String AwayUrl;
     private boolean saveToBookmarks;
     private int CountOfWatching;


     private int ownerId;
     private int fromId;
     private int createdBy;
     private int replyOwnerId;
     private int replyPostId;
     private boolean friendsOnly;
     private CommentsInfo commentsInfo;
     private Copyright copyright;
     private LikesInfo likesInfo;
     private RepostsInfo repostsInfo;
     private String postType;
     private PostSource postSource;
     private Geo geo;
     private int signerId;
     private boolean canPin;
     private boolean canDelete;
     private boolean canEdit;
     private boolean isPinned;
     private boolean markedAsAds;
     private Donut donut;
     private int postponed_id;








    // + getters/setters




}
