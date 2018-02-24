'use strict';

var gulp = require('gulp');
var imagemin = require('gulp-imagemin');
var sass = require('gulp-sass');

gulp.task('default',['sass'],function(){
  gulp.watch('sass/**/*', function() {
    gulp.run('default');
  });
});

gulp.task('imagemin', function () {
  var img_src = 'img/**/*', img_dest = 'build/img';
  gulp.src(img_src)
    //.pipe(changed(img_dest))
    .pipe(imagemin())
    .pipe(gulp.dest(img_dest));
});

gulp.task('sass',function () {
  return gulp.src('sass/bazarlist.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('styles'));
});

