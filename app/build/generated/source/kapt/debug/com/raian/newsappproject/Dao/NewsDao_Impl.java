package com.raian.newsappproject.Dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raian.newsappproject.converter.NewsConverter;
import com.raian.newsappproject.models.Bookmark;
import com.raian.newsappproject.models.Source;
import com.raian.newsappproject.models.TempArticle;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TempArticle> __insertionAdapterOfTempArticle;

  private final NewsConverter __newsConverter = new NewsConverter();

  private final EntityInsertionAdapter<Bookmark> __insertionAdapterOfBookmark;

  private final EntityDeletionOrUpdateAdapter<TempArticle> __deletionAdapterOfTempArticle;

  private final EntityDeletionOrUpdateAdapter<TempArticle> __updateAdapterOfTempArticle;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSports;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTechnology;

  private final SharedSQLiteStatement __preparedStmtOfDeleteScience;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTopNews;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllBookmarks;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTempArticle = new EntityInsertionAdapter<TempArticle>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `articles` (`id`,`author`,`content`,`description`,`publishedAt`,`source`,`title`,`catagory`,`url`,`urlToImage`,`likedArticle`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TempArticle value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishedAt());
        }
        final String _tmp = __newsConverter.toSource(value.getSource());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getCatagory() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCatagory());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getUrlToImage());
        }
        final int _tmp_1 = value.getLikedArticle() ? 1 : 0;
        stmt.bindLong(11, _tmp_1);
      }
    };
    this.__insertionAdapterOfBookmark = new EntityInsertionAdapter<Bookmark>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bookmark` (`id`,`author`,`content`,`description`,`publishedAt`,`title`,`url`,`urlToImage`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bookmark value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishedAt());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrlToImage());
        }
      }
    };
    this.__deletionAdapterOfTempArticle = new EntityDeletionOrUpdateAdapter<TempArticle>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `articles` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TempArticle value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTempArticle = new EntityDeletionOrUpdateAdapter<TempArticle>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `articles` SET `id` = ?,`author` = ?,`content` = ?,`description` = ?,`publishedAt` = ?,`source` = ?,`title` = ?,`catagory` = ?,`url` = ?,`urlToImage` = ?,`likedArticle` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TempArticle value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublishedAt());
        }
        final String _tmp = __newsConverter.toSource(value.getSource());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getCatagory() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCatagory());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getUrlToImage());
        }
        final int _tmp_1 = value.getLikedArticle() ? 1 : 0;
        stmt.bindLong(11, _tmp_1);
        stmt.bindLong(12, value.getId());
      }
    };
    this.__preparedStmtOfDeleteSports = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from articles where catagory = 'sports' ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTechnology = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from articles where catagory = 'technology' ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteScience = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from articles where catagory = 'science' ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTopNews = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from articles where catagory = 'business' ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllBookmarks = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM bookmark";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM articles";
        return _query;
      }
    };
  }

  @Override
  public Object insertArticles(final List<TempArticle> articles,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTempArticle.insert(articles);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertBookMark(final Bookmark article,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBookmark.insert(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final TempArticle article, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTempArticle.handle(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final TempArticle article, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTempArticle.handle(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deleteSports() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSports.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSports.release(_stmt);
    }
  }

  @Override
  public void deleteTechnology() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTechnology.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTechnology.release(_stmt);
    }
  }

  @Override
  public void deleteScience() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteScience.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteScience.release(_stmt);
    }
  }

  @Override
  public void deleteTopNews() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTopNews.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTopNews.release(_stmt);
    }
  }

  @Override
  public Object deleteAllBookmarks(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllBookmarks.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllBookmarks.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<TempArticle>> getArticles() {
    final String _sql = "SELECT * FROM articles";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"articles"}, false, new Callable<List<TempArticle>>() {
      @Override
      public List<TempArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCatagory = CursorUtil.getColumnIndexOrThrow(_cursor, "catagory");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final int _cursorIndexOfLikedArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "likedArticle");
          final List<TempArticle> _result = new ArrayList<TempArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TempArticle _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final Source _tmpSource;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSource);
            }
            _tmpSource = __newsConverter.fromString(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCatagory;
            if (_cursor.isNull(_cursorIndexOfCatagory)) {
              _tmpCatagory = null;
            } else {
              _tmpCatagory = _cursor.getString(_cursorIndexOfCatagory);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            final boolean _tmpLikedArticle;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfLikedArticle);
            _tmpLikedArticle = _tmp_1 != 0;
            _item = new TempArticle(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpCatagory,_tmpUrl,_tmpUrlToImage,_tmpLikedArticle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TempArticle>> getBusinessNews() {
    final String _sql = "SELECT * FROM articles WHERE catagory = 'business' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"articles"}, false, new Callable<List<TempArticle>>() {
      @Override
      public List<TempArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCatagory = CursorUtil.getColumnIndexOrThrow(_cursor, "catagory");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final int _cursorIndexOfLikedArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "likedArticle");
          final List<TempArticle> _result = new ArrayList<TempArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TempArticle _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final Source _tmpSource;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSource);
            }
            _tmpSource = __newsConverter.fromString(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCatagory;
            if (_cursor.isNull(_cursorIndexOfCatagory)) {
              _tmpCatagory = null;
            } else {
              _tmpCatagory = _cursor.getString(_cursorIndexOfCatagory);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            final boolean _tmpLikedArticle;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfLikedArticle);
            _tmpLikedArticle = _tmp_1 != 0;
            _item = new TempArticle(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpCatagory,_tmpUrl,_tmpUrlToImage,_tmpLikedArticle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TempArticle>> getSportsNews() {
    final String _sql = "SELECT * FROM articles WHERE catagory = 'sports' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"articles"}, false, new Callable<List<TempArticle>>() {
      @Override
      public List<TempArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCatagory = CursorUtil.getColumnIndexOrThrow(_cursor, "catagory");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final int _cursorIndexOfLikedArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "likedArticle");
          final List<TempArticle> _result = new ArrayList<TempArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TempArticle _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final Source _tmpSource;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSource);
            }
            _tmpSource = __newsConverter.fromString(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCatagory;
            if (_cursor.isNull(_cursorIndexOfCatagory)) {
              _tmpCatagory = null;
            } else {
              _tmpCatagory = _cursor.getString(_cursorIndexOfCatagory);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            final boolean _tmpLikedArticle;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfLikedArticle);
            _tmpLikedArticle = _tmp_1 != 0;
            _item = new TempArticle(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpCatagory,_tmpUrl,_tmpUrlToImage,_tmpLikedArticle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TempArticle>> getScienceNews() {
    final String _sql = "SELECT * FROM articles WHERE catagory = 'science' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"articles"}, false, new Callable<List<TempArticle>>() {
      @Override
      public List<TempArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCatagory = CursorUtil.getColumnIndexOrThrow(_cursor, "catagory");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final int _cursorIndexOfLikedArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "likedArticle");
          final List<TempArticle> _result = new ArrayList<TempArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TempArticle _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final Source _tmpSource;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSource);
            }
            _tmpSource = __newsConverter.fromString(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCatagory;
            if (_cursor.isNull(_cursorIndexOfCatagory)) {
              _tmpCatagory = null;
            } else {
              _tmpCatagory = _cursor.getString(_cursorIndexOfCatagory);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            final boolean _tmpLikedArticle;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfLikedArticle);
            _tmpLikedArticle = _tmp_1 != 0;
            _item = new TempArticle(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpCatagory,_tmpUrl,_tmpUrlToImage,_tmpLikedArticle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TempArticle>> getTechnologyNews() {
    final String _sql = "SELECT * FROM articles WHERE catagory = 'technology' ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"articles"}, false, new Callable<List<TempArticle>>() {
      @Override
      public List<TempArticle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCatagory = CursorUtil.getColumnIndexOrThrow(_cursor, "catagory");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final int _cursorIndexOfLikedArticle = CursorUtil.getColumnIndexOrThrow(_cursor, "likedArticle");
          final List<TempArticle> _result = new ArrayList<TempArticle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TempArticle _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final Source _tmpSource;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSource);
            }
            _tmpSource = __newsConverter.fromString(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCatagory;
            if (_cursor.isNull(_cursorIndexOfCatagory)) {
              _tmpCatagory = null;
            } else {
              _tmpCatagory = _cursor.getString(_cursorIndexOfCatagory);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            final boolean _tmpLikedArticle;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfLikedArticle);
            _tmpLikedArticle = _tmp_1 != 0;
            _item = new TempArticle(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpSource,_tmpTitle,_tmpCatagory,_tmpUrl,_tmpUrlToImage,_tmpLikedArticle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Bookmark>> getAllBookMark() {
    final String _sql = "SELECT * FROM bookmark";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"bookmark"}, false, new Callable<List<Bookmark>>() {
      @Override
      public List<Bookmark> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final List<Bookmark> _result = new ArrayList<Bookmark>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Bookmark _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpUrlToImage;
            if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
              _tmpUrlToImage = null;
            } else {
              _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            }
            _item = new Bookmark(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpPublishedAt,_tmpTitle,_tmpUrl,_tmpUrlToImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
