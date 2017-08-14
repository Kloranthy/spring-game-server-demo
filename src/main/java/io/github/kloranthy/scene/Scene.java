package io.github.kloranthy.scene;

/**
 */
public class Scene {
  private String sceneId;
  // todo counters or entities in scene

  public Scene() {}

  public String getSceneId() {
    return this.sceneId;
  }

  public Scene setSceneId( String sceneId ) {
    this.sceneId = sceneId;
    return this;
  }

  public Scene clone() {
    Scene clone = new Scene();
    clone.setSceneId( this.sceneId );
    return clone;
  }
}
